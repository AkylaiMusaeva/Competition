import javax.print.attribute.standard.PresentationDirection;

public class Book implements Interface{
    /**Задачка Book:
//
//Book класс(name, author)
//interface
//(vipName( 5 тамгадан аз болсо “vip” деген соз name-дин экинчи тамгадан кийин
// “vip”деген соз кошулуп калсын))(мисалы Аскар -> Асvipкар
//(author (эки окшош тамга бар болуп калса ошол тамганын биринчи тамгасын
// чон тамгага алмаштырып койсун)
// мисалы :
//error ->eRror,
//wwerreree ->WweRrerEe*/
    private String name;
    private String author;
    Book(){

    }
    Book(String name, String author) {
        this.name = name;
        this.author = author;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
    @Override
    public void vipName(String name) {
        if(name.length()<=5){
            StringBuilder stringBuilder=new StringBuilder(name);
            stringBuilder.insert(2,"vip");
            System.out.println(stringBuilder);
        }else{
            System.out.println(getName());
        }
    }
    @Override
    public void replaceLetters(String author) {
        StringBuilder result=new StringBuilder();
        for(int i=0;i<author.length();i++){
        char length1=author.charAt(i);
        if(i<author.length()-1 && Character.toUpperCase(length1)==Character.toUpperCase(author.charAt(i+1))){
            result.append(Character.toUpperCase(length1));
        }else {
                result.append(length1);
            }
        }
        System.out.println(result);
    }
}


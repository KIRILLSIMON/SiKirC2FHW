public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook=new PhoneBook();
        for (int i=0;i<20;i++){
            long number=89012345;
            phoneBook.add("ФИ"+(i+1),String.valueOf(number+i));
        }
    phoneBook.print();
    }
}
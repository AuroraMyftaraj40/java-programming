package day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection = 1;
        if(selection==1) {
            System.out.println("Hello, thank you for your call.");
        }else if(selection==2){
            System.out.println("Hello, gracias para llamar.");
        }else if(selection==3){
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        }else if(selection==4){
            System.out.println("Pershendetje, faleminderit per telefonaten.");
        }else{
            System.out.println("Let's talk java.");
        }
    }
}

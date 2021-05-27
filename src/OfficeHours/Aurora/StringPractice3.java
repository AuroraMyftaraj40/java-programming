package OfficeHours.Aurora;

public class StringPractice3 {
    public static void main(String[] args) {
        //Given a sentence. Display the sentence with the first word moved to the end of the sentence.
        //Ex:
        //input: Java is a fun language
        //output: is a fun language Java
        //Hint: Use indexOf and substring

        String sentence = "Java is a fun language";
        String newSentence = sentence.substring(sentence.indexOf(" ") + 1) + " " +
                sentence.substring(0, sentence.indexOf(" "));

        System.out.println(newSentence);

        //Given a String in the following format:
        //“Sender: <James Bond>. From Number: [202-123-3456]. +
        //Message: {“I love programming and problem solving}”
        //Separate these parts and print them separately:
        //“Sender: actualSender”
        //“Number: actualNumber”
        //“Message: actualMessage”

        String data="<James Bond>. From Number: [202-123-3456].";
        String message="{“I love programming and problem solving}”";
        System.out.println("Sender: " + data.substring(data.indexOf("<")+1, data.indexOf(">")));
        System.out.println("Number: " + data.substring(data.indexOf("[")+1, data.indexOf("]")));
        System.out.println("Message: " + message.substring(message.indexOf("I"), message.indexOf("}")));


       // Ask user to enter two strings. Both of these strings should be at least 6 character long. If they
        //are shorter than that print “Invalid data” and program should end.
        //If the information provided is valid, you will take the first 4 characters of first string and
        //combine them with the last three characters of the second string. At the end of your combined
        //string add “@cybertek.com” and print the final string as your created email. The final email
        //should be in all lowercase.
        //        input:
        //JamesBond
        //        Secret
        //output:
        //jameret@cybertek.com

        String name1= "James";
        String word="Secret";
        if(name1.length()<6 && word.length()<6){
            System.out.println("Invalid data");
        }else{
            System.out.println(name1.substring(0, 4).toLowerCase()+word.substring(3)+"@cybertek.com");
        }

    }
}

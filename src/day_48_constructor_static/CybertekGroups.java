package day_48_constructor_static;

public class CybertekGroups {
    public static void main(String[] args) {
       Group group1 = new Group("Cyberbugs");//dipendency injection
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");
        group1.addMember("Ali");
        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());
    }
}

package phonebook;

public class Main {
    public static void main(String[] args) {
        Phonebook p = new Phonebook();

        p.addUser("me", "302-401-9621");
        p.addUser("the cops", "911");
        p.addUser("friend", "410-845-8764");

        System.out.println();

        System.out.printf(p.lookupAUser("friend"));
        System.out.printf(p.reverseLookupAUser("911"));

        p.removeAUser("friend");

        System.out.println();

        System.out.println(p.listAllUsers());
    }
}

public class Main {

  public static void main(String[] args) {
    /*
     * TODO: Make changes to the Superhero class (provided in a separate file) so
     * that the following code compiles and so that each superhero's details is printed out
     * nicely
     */
    Superhero spiderman1 = new Superhero("Spiderman", "Red suit", "Super Web");
    System.out.println(spiderman1);
    Superhero batman1 = new Superhero("Batman", "Batsuit", "Super Strength");
    spiderman1.loseLife();
    System.out.println(batman1);

  }

  public static void superheroFight(Superhero hero1, Superhero hero2) {
    if (hero1.getWeaponStrength() > hero2.getWeaponStrength()) {
      hero2.loseLife();
      System.out.println(hero1);
    } else if (hero1.getWeaponStrength() < hero2.getWeaponStrength()) {
      hero1.loseLife();
      System.out.println(hero2);
    } else {
      System.out.println("It's a tie!");
    }
  }

}

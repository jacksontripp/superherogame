public class Main {

  public static void main(String[] args) {
    /*
     * TODO: Make changes to the Superhero class (provided in a separate file) so
     * that the following code compiles and so that each superhero's details is printed out
     * nicely
     */
    Superhero batman = new Superhero("Batman", "Batsuit", "Batarang");
    Superhero spiderman = new Superhero("Spiderman", "Redsuit", "SuperWeb");
    Superhero placeholder = new Superhero();
    
    System.out.println(batman);
    System.out.println(spiderman);

    System.out.println("The Green Goblin shows up...");
    spiderman.loseLife();
    System.out.println(spiderman);

    int batmanSpecial = batman.specialAttack(4);
    int placeholderSpecial = placeholder.specialAttack(9001);

    System.out.println(batman.name + " uses his special attack and deals " + batmanSpecial + " damage.");
    System.out.println(placeholder.name + " uses his special attack and deals " + placeholderSpecial + " damage.");

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

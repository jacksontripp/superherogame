public class Superhero {
  private  String name;
  private  String costume;
  private  String weapon;
  private boolean life;
  private int weaponStrength;

  // TODO #1: Add missing constructors. Note that the life attribute should default to true and the weaponStrength attribute should default to 0.
public Superhero(String name, String costume, String weapon) {
    this.name = name;
    this.costume = costume;
    this.weapon = weapon;
    this.life = true; // default value
    this.weaponStrength = (int) (Math.random() * 10) + 1; // default value
  }
  // TODO #2: Add missing methods.
  public boolean loseLife() {
    this.life = false;
    return this.life;
  }

  public int getWeaponStrength() {
    return this.weaponStrength;
  }
  
  public String getWeapon() {
    return this.weapon;
  }
  // TODO #3: Including a toString() method (see 2.7) to help with printing out the Superhero details.
  public String toString(){
  // all your code below to create a string with details
    String superHeroDetails = "Name: " + this.name + "\n" +
                              "Costume: " + this.costume + "\n" +
                              "Weapon: " + this.weapon + "\n" +
                              "Life: " + (this.life ? "Alive" : "Dead") + "\n" +
                              "Weapon Strength: " + this.weaponStrength;
    return superHeroDetails;
  }
}
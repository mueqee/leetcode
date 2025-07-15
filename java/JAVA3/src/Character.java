
class Character {
    String name;
    String race;
    String charClass;
    int level;
}

class Main {
    public static void main(String[] args) {
        Character hero = new Character();
        hero.name = "Gale";
        hero.race = "Human";
        hero.charClass = "Warlock";
        hero.level = 1;

        System.out.println(hero.name + " — "
                + hero.race + " "
                + hero.charClass + " "
                + hero.level + " level");
    }
}
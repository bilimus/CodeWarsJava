/* https://www.codewars.com/kata/577bd8d4ae2807c64b00045b/train/java

Create a function that returns the name of the winner in a fight between two fighters.

Each fighter takes turns attacking the other and whoever kills the other first is victorious. Death is defined as having health <= 0.

Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.

Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0. You can mutate the Fighter objects.

 */


public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        while (true) {
            if (firstAttacker == fighter1.name) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) return fighter1.name;
                firstAttacker = fighter2.name;
            } else {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) return fighter2.name;
                firstAttacker = fighter1.name;
            }
       }
    }
}


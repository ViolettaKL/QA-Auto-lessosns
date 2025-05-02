package HW_5.Aquarium;

/**
 *  Аквариум
 * Условие:
 * В аквариуме может находиться одно морское существо.
 * В зависимости от существа, оно ведёт себя по-разному.
 * Примеры:
 * Акула плавает быстро и агрессивно
 * Морская звезда медленно ползает
 * Нужно спроектировать систему, в которой можно добавить существо и продемонстрировать его поведение.
 *
 * Сущности:
 *          аквариум, морское существо (акула, морская звезда)
 * Действия, свойства, связи:
 *          морское существо - свойств нет
 *          может двигаться
 *       подвиды(наследование): звезда - нет свойств
 *                              двигается(ползает по дну)
 *                              акула - нет свойств
 *                              двигаться (агрессивно и быстро)
 *                              аквариум - одно морское существо
 *                              действие: добавить, заставить двигаться
 *
 */
public class Main {
    public static void main(String[] args) {
        AquariumSystem aquariumSystem = new AquariumSystem();
        SeaCreature creature = new Shark();
        aquariumSystem.setCreature(creature);
        aquariumSystem.move();

        SeaCreature creature1 = new StarFish();
        aquariumSystem.setCreature(creature1);
        aquariumSystem.move();
    }
}

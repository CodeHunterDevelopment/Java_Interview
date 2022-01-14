public class AddQ_02 {
    public static void main(String[] args) {
        Object food = null;
        eat(food);
    }

    private static void eat(Object food) {
    }


    public interface IFood{
        default void consume() {
            System.out.println("Consumed");
        }
    }

    public interface IAnimal {
        default boolean eat(IFood food) {
            if (!canConsume(food)) {
                return false;
            }
            food.consume();
            return true;
        }
        boolean canConsume(IFood food);
    }
}

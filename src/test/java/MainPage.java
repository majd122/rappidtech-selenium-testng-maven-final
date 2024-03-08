import com.github.javafaker.Faker;

public class MainPage {
    public static void main(String[] args) {
        Faker faker= new Faker();
        // (faker.internet().u
        for (int i =0; i<10;i++){
            System.out.println(faker.address().streetAddress());
            var me = "---";
            System.out.println(me);
        }
    }
}

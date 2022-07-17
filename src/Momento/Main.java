package Momento;

public class Main {
    public static void main(String[] args) {
        Moment moment = new Moment ();
        moment.set ("Кушаем", "Бублик");
        System.out.println (moment);

        MomentsWithCats momentsWithCats = new MomentsWithCats ();
        momentsWithCats.setPhoto (moment.TakePicture ());

        moment.set ("Спим", "Бублик");
        System.out.println (moment);

        moment.showPhoto (momentsWithCats.getPhoto ());
        System.out.println (moment);
    }
}

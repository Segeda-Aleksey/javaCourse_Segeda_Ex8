public class Main {

    public static void main(String[] args) {

        SpeedCar<String> speedCar1 = new SpeedCar<>("car1", "01");
        SpeedCar<String> speedCar2 = new SpeedCar<>("car1", "01");
        System.out.println(speedCar1.equals(speedCar2));
        Track<Integer> track1 = new Track("Track", " 2");
        Track<Integer> track2 = new Track("Track - 2", " 01");
        System.out.println(track1.equals(track2));
        String test = track1.toString();
        System.out.println(test);

    }
}

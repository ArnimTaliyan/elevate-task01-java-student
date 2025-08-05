package Day2;

public class FeatureFactory {
    public static Feature getFeature(int choice) {
        return switch (choice) {
            case 1 ->new AddFeature();
            case 2 ->new ViewFeature();
//                case 3 -> feature = new DeleteFeature();
//                case 4 -> feature = new UpdateFeature();
            default -> null;
        };
    }
}
//Checks for choice and return feature

package MenuAndChoice;

import Features.*;

public class FeatureFactory {
    public static Feature getFeature(int choice) {
        return switch (choice) {
            case 1 ->new AddFeature();
            case 2 ->new ViewFeature();
            case 3 ->new DeleteFeature();
            case 4 ->new UpdateFeature();
            default -> null;
        };
    }
}
package driver.com.driver.screens;

/**
 * Created by kalaivani on 5/7/2016.
 */
public class DestinationResponse {

  String  ToLongitude, ToLatitude, ToAddress;

    public DestinationResponse() {
    }

    public DestinationResponse(String toLongitude, String toLatitude, String toAddress) {

        ToLongitude = toLongitude;
        ToLatitude = toLatitude;
        ToAddress = toAddress;
    }

    public String getToLongitude() {

        return ToLongitude;
    }

    public void setToLongitude(String toLongitude) {
        ToLongitude = toLongitude;
    }

    public String getToLatitude() {
        return ToLatitude;
    }

    public void setToLatitude(String toLatitude) {
        ToLatitude = toLatitude;
    }

    public String getToAddress() {
        return ToAddress;
    }

    public void setToAddress(String toAddress) {
        ToAddress = toAddress;
    }
}

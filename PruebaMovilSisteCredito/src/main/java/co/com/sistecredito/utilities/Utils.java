package co.com.sistecredito.utilities;

public class Utils {

  public static int generateRandomNumbers(int majorNumber, int minorNumber) {
    return (int)
        Math.floor(Math.random() * (minorNumber - (majorNumber + minorNumber)) + (majorNumber));
  }
}

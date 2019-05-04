package api;

public class Weather {

  private final int high;
  private final int low;
  private final String type;
  private final String favorite;

  public Weather(int high, int low, String type, String favorite) {
    this.high = high;
    this.low = low;
    this.type = type;
    this.favorite = favorite;
  }

  public int getHigh() {
      return high;
  }

  public int getLow() {
      return low;
  }

  public String getType() {
      return type;
  }

  public String getFavorite() {
      return favorite;
  }
}

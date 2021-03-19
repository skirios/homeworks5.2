public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();
    long bonusMile = service.calculate(1000_60, true);
     System.out.println("Ваши мили: " +bonusMile);
  }
}


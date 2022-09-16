class Main {
  public static void main(String[] args) {
    // TODO CODE application logic here

    // Kim Chaehyun
    String idol1 = "Kim Chaehyun";
    String month1 = "April";
    int day1 = 26;
    int year1 = 2002;
    int height1 = 160;

    // Shen Xiaoting
    String idol2 = "Shen Xiaoting";
    String month2 = "November";
    int day2 = 12;
    int year2 = 1999;
    int height2 = 168;

    // Huening Bahiyyih
    String idol3 = "Huening Bahiyyih";
    String month3 = "July";
    int day3 = 27;
    int year3 = 2004;
    int height3 = 166;

    System.out.printf("%nName: %s %n", idol1);
    System.out.printf("Height: %dcm %n", height1);
    System.out.printf("Birthday: %s %d %d %n", month1, day1, year1);

    System.out.printf("%nName: %s %n", idol2);
    System.out.printf("Height: %dcm %n", height2);
    System.out.printf("Birthday: %s %d %d %n", month2, day2, year2);

    System.out.printf("%nName: %s %n", idol3);
    System.out.printf("Height: %dcm %n", height3);
    System.out.printf("Birthday: %s %d %d %n", month3, day3, year3);

    System.out.printf("%nIs Kim Chaehyun taller than Shen Xiaoting? %s %n", height1 > height2);
    System.out.printf("%nIs Shen Xiaoting taller than Huening Bahiyyih? %s %n", height2 > height3);
    System.out.printf("%nIs Huening Bahiyyih taller than Kim Chaehyun? %s %n", height3 > height1);

    System.out.printf("%nIs Kim Chaehyun older than Shen Xiaoting? %s %n", year1 < year2);
    System.out.printf("%nIs Shen Xiaoting older than Huening Bahiyyih? %s %n", year2 < year3);
    System.out.printf("%nIs Huening Bahiyyih older than Kim Chaehyun? %s %n", year3 < year1);

  }
}
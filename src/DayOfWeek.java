public enum DayOfWeek {
    MONDAY("Дуйшомбу жава сабагын окуйм"),
    TUESDAY("Шейшемби Англис тили сабагын окуйм"),
    WEDNESDAY("шаршемби жава сабагын окуйм"),
    THURSDAY("Бейшемби жава практика сабагын окуйм"),
    FRIDAY("Жума жава сабагын окуйм"),
    SATURDAY("ишемби жава практика сабагын окуйм"),
    SUNDAY("Жекшемби сабак жоок эс алабыз");

    private  String schedule;

 DayOfWeek(String schedule) {
  this.schedule = schedule;
 }

 public String getSchedule() {
  return schedule;
 }

 @Override
 public String toString() {
  return "DayOfWeek{" +
          "schedule='" + schedule + '\'' +
          '}';
 }
}

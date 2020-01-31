public class Programmer extends Nerds{
  private int caffeine;

  public Programmer(int sleepHours, int socialSkills, int caffeine) {
    super(sleepHours, socialSkills);
    this.caffeine = caffeine;
  }

  public int getCaffeine() {
    return caffeine;
  }
}

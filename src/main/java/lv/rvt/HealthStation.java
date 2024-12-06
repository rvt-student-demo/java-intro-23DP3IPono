package lv.rvt;

public class HealthStation {
        public int number_weighings;

        public int weigh(Person person) {
            number_weighings++;
            return person.getWeigh();
        }

        public void feed(Person person) {
            person.setWeight(person.getWeigh()+1);
        }

        public int weighings() {
            return number_weighings;
        }
    }

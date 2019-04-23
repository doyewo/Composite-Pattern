public class CompositeClient {
    public static void main(String[] args) {

        Employee CEO = new Employee("Dexter", "CEO", 100000);
        Employee marketing = new Employee("Meghan", "Head Marketing", 80000);
        Employee sales = new Employee("David", "Head Sales", 80000);

        Employee secretary1 = new Employee("Sarah", "Assistance", 40000);
        Employee secretary2 = new Employee("Michael", "Assistance", 40000);

        Employee salesAssitant1 = new Employee ("Will", "Sales", 45000);
        Employee salesAssistant2 = new Employee ("Kevin", "Sales", 45000);

        CEO.add(marketing);
        CEO.add(sales);

        marketing.add(secretary1);
        marketing.add(secretary2);

        sales.add(salesAssitant1);
        sales.add(salesAssistant2);

        System.out.println(CEO);

        for (Employee headEmployee : CEO.getAide()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getAide()) {
                System.out.println(employee);
            }
        }


    }
}

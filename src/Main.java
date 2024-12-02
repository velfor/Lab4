import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {

        final int size = 2;

        Cloud[] cloudArray = new Cloud[size];
        for (int i = 0; i < size; i++) {
            cloudArray[i] = createCloud();
            printCloud(cloudArray[i]);
        }
        //System.out.println(Arrays.toString(cloudArray));

        Collaboration[] collaborationArray = new Collaboration[size];
        for (int i = 0; i < size; i++) {
            collaborationArray[i] = createCollaboration();
            printCollaboration(collaborationArray[i]);
        }

        Company[] companyArray = new Company[size];
        for (int i = 0; i < size; i++) {
            companyArray[i] = createCompany();
            printCompany(companyArray[i]);
        }
    }

    public static Cloud createCloud() throws Exception {
        System.out.println("Введите информацию о облаке:");
        System.out.print("Имя: ");
        String cloudName = reader.readLine();
        System.out.print("Количество сотрудников: ");
        int employeeCount = Integer.parseInt(reader.readLine());
        System.out.print("Название проекта: ");
        String projectName = reader.readLine();
        System.out.print("Публичный? (введите True или False): ");
        boolean isPublic = Boolean.parseBoolean(reader.readLine());
        return new Cloud(cloudName, employeeCount, projectName, isPublic);
    }

    public static void printCloud(Cloud cloud) {
        System.out.println("\n=====");
        System.out.println(cloud);
    }

    public static Collaboration createCollaboration() throws Exception {
        System.out.println("\nВведите информацию о сотрудничестве:");
        System.out.print("Название сотрудничества: ");
        String collabName = reader.readLine();
        System.out.print("Количество сотрудников: ");
        int employeeCount = Integer.parseInt(reader.readLine());
        System.out.print("Название проекта: ");
        String projectName = reader.readLine();
        return new Collaboration(collabName, employeeCount, projectName);
    }

    public static void printCollaboration(Collaboration collaboration) {
        System.out.println("\n=====");
        System.out.println(collaboration);
    }

    public static Company createCompany() throws Exception {
        System.out.println("\nВведите информацию о компании:");
        System.out.print("Название компании: ");
        String companyName = reader.readLine();
        System.out.print("Количество сотрудников: ");
        int employeeCount = Integer.parseInt(reader.readLine());
        return new Company(companyName, employeeCount);
    }

    public static void printCompany(Company company) {
        System.out.println("\n=====");
        System.out.println(company);
    }
}
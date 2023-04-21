import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your monthly income: ");
        float income = s.nextFloat();
        float total_expenses=0;
        int exp_nO = s.nextInt();

        int[] expenses = new int[exp_no];
        
        if () {

        }
    }
    
}

// income = float(input("Enter your monthly income: "))
// expenses = []
// total_expenses = 0

// while True:
//     expense = input("Enter an expense (or 'done' to finish): ")
//     if expense == "done":
//         break
//     expense_cost = float(input("Enter the cost of the expense: "))
//     expenses.append((expense, expense_cost))
//     total_expenses += expense_cost

// print("Your monthly income is " + income)
// print("You have $" + (income - total_expenses) + "left after expenses")
// print("Your expenses:")
// for expense, cost in expenses:
//     print(expense+": "+ cost)
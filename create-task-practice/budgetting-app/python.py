income = float(input("Enter your monthly income: "))
expenses = []
total_expenses = 0

while True:
    expense = input("Enter an expense (or 'done' to finish): ")
    if expense == "done":
        break
    expense_cost = float(input("Enter the cost of the expense: "))
    expenses.append((expense, expense_cost))
    total_expenses += expense_cost

print("Your monthly income is " + income)
print("You have $" + (income - total_expenses) + "left after expenses")
print("Your expenses:")
for expense, cost in expenses:
    print(expense+": "+ cost)
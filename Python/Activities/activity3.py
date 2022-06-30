player1 = input("Please enter first player name")
player2 = input("Please enter second player name")

player1_choice = input(player1 + " Please select your choice rock paper or scissor ").lower()
player2_choice = input(player2 + " Please select your choice rock paper or scissor ").lower()

if player1_choice == player2_choice:
    print("It's a tie")
elif player1_choice == "rock":
    if player2_choice == "paper":
        print("paper wins")
    else:
        print("scissor wins")
elif player1_choice == "scissor":
    if player2_choice == "rock":
        print("rock wins")
    else:
        print("paper wins")
elif player1_choice == "paper":
    if player2_choice == "scissor":
        print("scissor wins")
    else:
        print("rock wins")
else:
    print("You didn't select neither rock nor paper nor scissor. Please try again")
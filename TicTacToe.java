import java.util.Scanner;
public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int turn=1,pos;
		char game[]={'_','_','_','_','_','_','_','_','_'};
		
		while(turn<=9)
		{
			if(turn%2==0)
			{
				System.out.print("Player 2 enter position=>");
				pos=sc.nextInt();
				game[pos-1]='X';
			}
			else
			{
				System.out.println("Player 1 enter position=>");
				pos=sc.nextInt();
				game[pos-1]='O';
			}
			
			System.out.println("******************");
			System.out.println(game[0]+"\t"+game[1]+"\t"+game[2]);
			System.out.println(game[3]+"\t"+game[4]+"\t"+game[5]);
			System.out.println(game[6]+"\t"+game[7]+"\t"+game[8]);
			System.out.println("******************");
			
			if(game[0]==game[1] && game[1]==game[2])
			{
				if(game[0]=='X')
				{
					System.out.print("Player 2 has Won!");
					turn=11;
				}
				else if(game[0]=='O')
				{
					System.out.print("Player 1 has Won!");
					turn=11;
				}
			}
			if(game[3]==game[4] && game[4]==game[5])
			{
				if(game[3]=='X')
				{
					System.out.print("Player 2 has Won!");
					turn=11;
				}
				else if(game[3]=='O')
				{
					System.out.print("Player 1 has Won!");
					turn=11;
				}
			}
			if(game[6]==game[7] && game[7]==game[8])
			{
				if(game[6]=='X')
				{
					System.out.print("Player 2 has Won!");
					turn=11;
				}
				else if(game[6]=='O')
				{
					System.out.print("Player 1 has Won!");
					turn=11;
				}
			}
			if(game[0]==game[3] && game[3]==game[6])
			{
				if(game[0]=='X')
				{
					System.out.print("Player 2 has Won!");
					turn=11;
				}
				else if(game[0]=='O')
				{
					System.out.print("Player 1 has Won!");
					turn=11;
				}
			}
			if(game[1]==game[4] && game[4]==game[7])
			{
				if(game[1]=='X')
				{
					System.out.print("Player 2 has Won!");
					turn=11;
				}
				else if(game[1]=='O')
				{
					System.out.print("Player 1 has Won!");
					turn=11;
				}
			}
			if(game[2]==game[5] && game[5]==game[8])
			{
				if(game[2]=='X')
				{
					System.out.print("Player 2 has Won!");
					turn=11;
				}
				else if(game[2]=='O')
				{
					System.out.print("Player 1 has Won!");
					turn=11;
				}
			}
			if(game[0]==game[4] && game[4]==game[8])
			{
				if(game[0]=='X')
				{
					System.out.print("Player 2 has Won!");
					turn=11;
				}
				else if(game[0]=='O')
				{
					System.out.print("Player 1 has Won!");
					turn=11;
				}
			}
			if(game[2]==game[4] && game[4]==game[6])
			{
				if(game[2]=='X')
				{
					System.out.print("Player 2 has Won!");
					turn=11;
				}
				else if(game[2]=='O')
				{
					System.out.print("Player 1 has Won!");
					turn=11;
				}
			}
			turn++;
			
		}
		if(turn==10)
		{
			System.out.print("Tie");
		}

	}

}

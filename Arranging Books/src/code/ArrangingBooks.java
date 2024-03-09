package code;

import java.util.Scanner;

public class ArrangingBooks {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String books = input.next();
		int swap = 0;
		int L = 0, M = 0, S = 0;
		
		char[] booksArray = books.toCharArray();

		for(int x = 0; x < books.length(); x++)
		{
			if(booksArray[x] == 'L')
			{
				L++;
			}
			else if(booksArray[x] == 'M') 
			{
				M++;
			}
			else 
			{
				S++;
			}
		}
		
		for(int x = 0; x < L; x++) 
		{
			if(booksArray[x] == 'M')//swap m in l with l in m
			{
				for(int y = L; y < L+M ; y++)
				{
					if(booksArray[y] == 'L')
					{
						booksArray[y] = 'M';
						booksArray[x] = 'L';
						swap++;
					}
				}
			}
			if(booksArray[x] == 'S')//swap s in l with l in s
			{
				for(int y = L+M; y < L+M+S ; y++)
				{
					if(booksArray[y] == 'L')
					{
						booksArray[y] = 'S';
						booksArray[x] = 'L';
						swap++;
					}
				}
			}
		 }
		
		for(int x = L; x < L+M; x++) 
		{
			if(booksArray[x] == 'S')//swap s in m with m in s
			{
				for(int y = L+M; y < L+M+S ; y++)
				{
					if(booksArray[y] == 'M')
					{
						booksArray[y] = 'S';
						booksArray[x] = 'M';
						swap++;
					}
				}
			}
		 }
		
		System.out.println(swap);
	}

}

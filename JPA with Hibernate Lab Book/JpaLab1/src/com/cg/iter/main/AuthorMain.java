package com.cg.iter.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.cg.iter.entity.AuthorEntity;
import com.cg.iter.service.AuthorServiceImpl;

public class AuthorMain {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		AuthorServiceImpl service = new AuthorServiceImpl();
		try {
			while(true) {
			
				//Menu 
				System.out.println("---------MENU--------");
				System.out.println("1. Enter New Author");
				System.out.println("2. Update Author");
				System.out.println("3. Delete Author");
				System.out.println("4. Exit");
				System.out.println("Enter your choice");
				String choice = null;
				choice = br.readLine();
				switch(choice) {
					case "1":
					//Adding Author
						AuthorEntity author = new AuthorEntity();
						System.out.println("Enter firstname");
						author.setFirstName(br.readLine());
						System.out.println("Enter middlename");
						author.setMiddleName(br.readLine());
						System.out.println("Enter lastname");
						author.setLastName(br.readLine());
						System.out.println("Enter phone number");
						author.setPhoneNo(br.readLine());
						if(service.addAuthor(author)) {
							System.out.println("author added");
						}else {
							System.out.println("author not added");
						}
						break;
					case "2":
					//Updating Author
						System.out.println("Enter author id");
						Integer id = Integer.parseInt(br.readLine());
						author = service.findAuthor(id);
						if(author != null) {
							System.out.println("Author eixst");
							System.out.println(author.toString());
							AuthorEntity temp = new AuthorEntity();
							temp.setAuthorId(author.getAuthorId());
							System.out.println("Enter firstname");
							temp.setFirstName(br.readLine());
							System.out.println("Enter middlename");
							temp.setMiddleName(br.readLine());
							System.out.println("Enter lastname");
							temp.setLastName(br.readLine());
							System.out.println("Enter phone number");
							temp.setPhoneNo(br.readLine());
							if(service.updateAuthor(temp)!=null) {
								System.out.println("Author updated");
							}else {
								System.out.println("Not updated");
							}
						}else {
							System.out.println("Author does not exist");
						}
						break;
					case "3":
					//Deleting Author
						System.out.println("Enter author id");
						id = Integer.parseInt(br.readLine());
						if(service.deleteAuthor(id)) {
							System.out.println("Author deleted");
						}else {
							System.out.println("Author not deleted");
						}
						break;
					case "4":
					//Exiting the Application
						System.out.println(".....Exiting System.....");
						System.exit(0);
					default:
						System.out.println("Please select from these 4 options");
						break;
				}
			}
		}catch(Exception e) {}
	}
}

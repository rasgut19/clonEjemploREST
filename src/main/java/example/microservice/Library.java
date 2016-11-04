package example.microservice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/library")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class Library {
	 @GET
	    @Path("/books")
	    public List<Book> getBooks() {
		 List<Book> b = new ArrayList<Book>();
		 Book bo = new Book();
		 bo.setTitle("test1");
		 bo.setIsbn("12345");
		 b.add(bo);
	    
		 bo = new Book();
		 bo.setTitle("test2");
		 bo.setIsbn("54321");
		 b.add(bo);
		 
		 return b;
	    }
	 
	    @GET
	    @Path("/book/{isbn}")
	    public Book getBook(@PathParam("isbn") String id) {
			return null;
	    
	    }
	 
	    @PUT
	    @Path("/book/{isbn}")
	    public Book addBook(@PathParam("isbn") String id, @QueryParam("title") String title) {
			return null;
	    }
	 
	    @POST
	    @Path("/book/{isbn}")
	    public Book updateBook(@PathParam("isbn") String id, String title) {
			return null;
	    }
	 
	    @DELETE
	    @Path("/book/{isbn}")
	    public Book removeBook(@PathParam("isbn") String id) {
			return null;
	    }
}

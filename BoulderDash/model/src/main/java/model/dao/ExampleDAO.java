package model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Blob;

import model.ModelFacade;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class ExampleDAO extends AbstractDAO {

	public static void getMap(int idLvl) throws SQLException, IOException {
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream("RECEIVED.txt"))));
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		BoulderDashBDDConnector con = new BoulderDashBDDConnector();
		con.open();
		con.executeQuery("SELECT * FROM Example");
		try(ResultSet resultSet = con.executeQuery("SELECT name FROM Example WHERE id = " + idLvl)) {
			while(resultSet.next()) {
	 		   	Blob blob = resultSet.getBlob("name");
				BufferedInputStream is = new BufferedInputStream(blob.getBinaryStream());
				FileOutputStream fos = new FileOutputStream("RECEIVED.txt");
				byte[] buffer = new byte[2048];
				int r = 0;
				while((r = is.read(buffer)) != -1) {
					fos.write(buffer, 0, r);
				}
				fos.flush();
				fos.close();
				is.close();
				blob.free();
			}
			resultSet.close();
			writer.flush();
			writer.close();
		}
		decrypt();
	}
	
	public static void decrypt() {
		ObjectInputStream ois = null;
		
		try {
			FileInputStream file = new FileInputStream("RECEIVED.txt");
			ois = new ObjectInputStream(file);
			Map map = (Map) ois.readObject();
			System.out.println("Lvl name = " + map.getName());
		    System.out.println("Id = " + map.getId());
		    System.out.println("Nbdiamond = " + map.getCountDiamond());	      
		    System.out.println("width = " + map.getWidth());
		    System.out.println("height = " + map.getHeight());
		    System.out.println("code map = " + map.getMapCode());
		    int width = map.getWidth();
		    int height = map.getHeight();
		    String mapCode = map.getMapCode();
		    generateObjectFromMap(width, height, mapCode);
		} catch(IOException e) {
			e.printStackTrace();
		} catch( ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois != null) {
					ois.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void generateObjectFromMap(int width, int height, String mapCode) {
		ModelFacade array = new ModelFacade(width, height, mapCode);
	}
	
	
	
	
    /** The sql example by id. *
    private static String sqlExampleById   = "{call findExampleById(?)}";

    /** The sql example by name. *
    private static String sqlExampleByName = "{call findExampleByName(?)}";

    /** The sql all examples. *
    private static String sqlAllExamples   = "{call findAllExamples()}";

    /** The id column index. *
    private static int    idColumnIndex    = 1;

    /** The name column index. *
    private static int    nameColumnIndex  = 2;

    /**
     * Gets the example by id.
     *
     * @param id
     *            the id
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     *
    public static Example getExampleById(final int id) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlExampleById);
        Example example = null;
        callStatement.setInt(1, id);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
            }
            result.close();
        }
        return example;
    }

    /**
     * Gets the example by name.
     *
     * @param name
     *            the name
     * @return the example by name
     * @throws SQLException
     *             the SQL exception
     /
    public static Example getExampleByName(final String name) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlExampleByName);
        Example example = null;

        callStatement.setString(1, name);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
            }
            result.close();
        }
        return example;
    }

    /**
     * Gets the all examples.
     *
     * @return the all examples
     * @throws SQLException
     *             the SQL exception
     *
    public static List<Example> getAllExamples() throws SQLException {
        final ArrayList<Example> examples = new ArrayList<Example>();
        final CallableStatement callStatement = prepareCall(sqlAllExamples);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();

            for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) {
                examples.add(new Example(result.getInt(idColumnIndex), result.getString(nameColumnIndex)));
            }
            result.close();
        }
        return examples;
    }
    */
}

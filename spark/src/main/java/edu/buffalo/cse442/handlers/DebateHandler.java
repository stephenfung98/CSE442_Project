package edu.buffalo.cse442.handlers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DebateHandler {

    /**
     * Create a debate in response to a POST request.
     * The parameters are TBD.
     *
     * @return The debate's details, the same as if you
     * had requested the details of that debate's ID.
     */
    public String createDebate() {
        /** TODO Add in creating a debate **/
        System.out.println("Created a debate!");
        return "";
    }

    /**
     * @param query The String to search for.
     * @return A list of debates matching the query String.
     */
    public String search(String query) {
        /**
         * TODO Implement searching debates
         */
        return "{\n" +
                "        \"1\":{\"id\":146,\"debateName\":\"Do you think CSE is a good program?\",\"createdDate\":\"Feb 18, 2019 1:00pm\",\"activeUsers\":5},\n" +
                "        \"2\":{\"id\":32546,\"debateName\":\"Is AI Dangerous?\",\"createdDate\":\"Feb 18, 2019 1:05pm\",\"activeUsers\":16},\n" +
                "        \"3\":{\"id\":72356,\"debateName\":\"What do you think of pizza?\",\"createdDate\":\"Feb 18, 2019 1:30pm\",\"activeUsers\":320},\n" +
                "        \"4\":{\"id\":5426788,\"debateName\":\"Is this the best app ever created in the history of apps?\",\"createdDate\":\"Feb 18, 2019 3:00pm\",\"activeUsers\":4}\n" +
                "}";
    }

    /**
     * @param id The id of the debate you would like the details of.
     * @return The details of the debate with the specified id.
     */
    public String get(int id) {
        /**
         * TODO Implement GET handler for getting info about a sepecific debate.
         */
        return "{\n" +
                "        \"question\":\"Do you think CSE is a good program?\",\n" +
                "        \"debateid\":147,\n" +
                "        \"totalcomments\":5,\n" +
                "        \"agree\":{\n" +
                "            \"displaytext\":\"Agree\",\n" +
                "            \"usercount\":2,\n" +
                "            \"commentcount\":3,\n" +
                "            \"comments\":{\n" +
                "                \"1\":{\"id\":146,\"debateName\":\"debate 146\",\"View\":\"Agree\",\"Comment\":\"It is Awesome!!!\",\"UserID\":\"dadkins20\"},\n" +
                "                \"2\":{\"id\":146,\"debateName\":\"debate 146\",\"View\":\"Agree\",\"Comment\":\"YEAH!!!!!!!!\",\"UserID\":\"mert\"},\n" +
                "                \"3\":{\"id\":146,\"debateName\":\"debate 146\",\"View\":\"Agree\",\"Comment\":\"Best APP ever :D\",\"UserID\":\"dadkins20\"}\n" +
                "            }\n" +
                "        },\n" +
                "        \"disagree\":{\n" +
                "            \"displaytext\":\"Disagree\",\n" +
                "            \"usercount\":2,\n" +
                "            \"commentcount\":2,\n" +
                "            \"comments\":{\n" +
                "                \"1\":{\"id\":146,\"debateName\":\"debate 146\",\"View\":\"Disagree\",\"Comment\":\"Eh!!\",\"UserID\":\"JonForce\"},\n" +
                "                \"2\":{\"id\":146,\"debateName\":\"debate 146\",\"View\":\"Disagree\",\"Comment\":\"Worst App Yet!!!!!!!!\",\"UserID\":\"Anu\"}\n" +
                "            }\n" +
                "        }\n" +
                "      }" +
                "}";
    }

    /**
     * @return a list of the most active debates.
     */
    public String getActive() {
        /** TODO Implement GET handler to return active debates. */
        return "{\n" +
                "        \"1\":{\"id\":146,\"debateName\":\"Do you think CSE is a good program?\",\"createdDate\":\"Feb 18, 2019 1:00pm\",\"activeUsers\":5},\n" +
                "        \"2\":{\"id\":32546,\"debateName\":\"Is AI Dangerous?\",\"createdDate\":\"Feb 18, 2019 1:05pm\",\"activeUsers\":16},\n" +
                "        \"3\":{\"id\":72356,\"debateName\":\"What do you think of pizza?\",\"createdDate\":\"Feb 18, 2019 1:30pm\",\"activeUsers\":320},\n" +
                "        \"4\":{\"id\":5426788,\"debateName\":\"Is this the best app ever created in the history of apps?\",\"createdDate\":\"Feb 18, 2019 3:00pm\",\"activeUsers\":4}\n" +
                "}";
    }

    /**
     * @return a list of the most controversial debates.
     */
    public String getControversial() {
        /** TODO Implement GET handler for returning contoversial debates. */
        return "{\n" +
                "        \"1\":{\"id\":146,\"debateName\":\"Do you think CSE is a good program?\",\"createdDate\":\"Feb 18, 2019 1:00pm\",\"activeUsers\":5},\n" +
                "        \"2\":{\"id\":32546,\"debateName\":\"Is AI Dangerous?\",\"createdDate\":\"Feb 18, 2019 1:05pm\",\"activeUsers\":16},\n" +
                "        \"3\":{\"id\":72356,\"debateName\":\"What do you think of pizza?\",\"createdDate\":\"Feb 18, 2019 1:30pm\",\"activeUsers\":320},\n" +
                "        \"4\":{\"id\":5426788,\"debateName\":\"Is this the best app ever created in the history of apps?\",\"createdDate\":\"Feb 18, 2019 3:00pm\",\"activeUsers\":4}\n" +
                "}";
    }

    public String getDebatesCreatedBy(int userID) {
        /** TODO Implement GET handler for returning debates created by a particular user. */
        return "{        \"1\":{\"id\":146,\"debateName\":\"Do you think CSE is a good program?\",\"createdDate\":\"Feb 18, 2019 1:00pm\",\"activeUsers\":5},\n" +
                "        \"2\":{\"id\":32546,\"debateName\":\"Is AI Dangerous?\",\"createdDate\":\"Feb 18, 2019 1:05pm\",\"activeUsers\":16},\n" +
                "        \"3\":{\"id\":72356,\"debateName\":\"What do you think of pizza?\",\"createdDate\":\"Feb 18, 2019 1:30pm\",\"activeUsers\":320},\n" +
                "        \"4\":{\"id\":5426788,\"debateName\":\"Is this the best app ever created in the history of apps?\",\"createdDate\":\"Feb 18, 2019 3:00pm\",\"activeUsers\":4}\n" +
                "}";
    }

    /**
     * @return a list of the most popular debates.
     */
    public String getPopularDebates() {
        /** TODO Implement GET handler for requesting popular debates. */
        return "{\n" +
                "        \"1\":{\"id\":146,\"debateName\":\"Do you think CSE is a good program?\",\"createdDate\":\"Feb 18, 2019 1:00pm\",\"activeUsers\":5},\n" +
                "        \"2\":{\"id\":32546,\"debateName\":\"Is AI Dangerous?\",\"createdDate\":\"Feb 18, 2019 1:05pm\",\"activeUsers\":16},\n" +
                "        \"3\":{\"id\":72356,\"debateName\":\"What do you think of pizza?\",\"createdDate\":\"Feb 18, 2019 1:30pm\",\"activeUsers\":320},\n" +
                "        \"4\":{\"id\":5426788,\"debateName\":\"Is this the best app ever created in the history of apps?\",\"createdDate\":\"Feb 18, 2019 3:00pm\",\"activeUsers\":4}\n" +
                "}";
    }

    /**
     * @return a list of the most recent debates.
     */
    public String getRecentDebates() {
        /** TODO Implement GET handler for getting recent debates. */
        return "{\n" +
                "        \"1\":{\"id\":146,\"debateName\":\"Do you think CSE is a good program?\",\"createdDate\":\"Feb 18, 2019 1:00pm\",\"activeUsers\":5},\n" +
                "        \"2\":{\"id\":32546,\"debateName\":\"Is AI Dangerous?\",\"createdDate\":\"Feb 18, 2019 1:05pm\",\"activeUsers\":16},\n" +
                "        \"3\":{\"id\":72356,\"debateName\":\"What do you think of pizza?\",\"createdDate\":\"Feb 18, 2019 1:30pm\",\"activeUsers\":320},\n" +
                "        \"4\":{\"id\":5426788,\"debateName\":\"Is this the best app ever created in the history of apps?\",\"createdDate\":\"Feb 18, 2019 3:00pm\",\"activeUsers\":4}\n" +
                "}";
    }
}
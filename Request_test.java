public class Request {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.makeGetRequest("https://serpapi.com/search.json?engine=google_scholar&q=Coffee&hl=en&api_key=919aa173c602e9a03604e83a1575ca23cd1dfea864b4baba79d19a2909edc1a7");
    }
}

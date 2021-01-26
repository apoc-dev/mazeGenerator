public class App {
    public static void main(String[] args) throws Exception {

        int size = 5;

        MazeGenerator generator = new MazeGenerator(size);
        generator.dfs();

        MazeProcessor proc = new MazeProcessor(generator.getList(), generator.getSize());
        proc.toBinary();
        proc.print();
    }
}

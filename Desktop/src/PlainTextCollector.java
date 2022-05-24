public class PlainTextCollector implements KeywordCollector{
    // berechnet den Set von Wörtern, die in einer Klartextdatei zur Verfügung gestellt werden
    @Override
	public Set<String> getKeywords(Resource res) {
        Iterator iterator = new TextFileIterator();
	}
}

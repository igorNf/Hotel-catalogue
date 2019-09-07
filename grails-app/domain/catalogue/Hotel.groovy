package catalogue

class Hotel {
	String name
	Country country
	int stars
	String homePage

	static belongsTo = Country

    static constraints = {
    	name blank: false, unique: "country", maxSize: 255
    	country blank: false
    	stars blank: false, range: 1..5
    	homePage url: true, blank: true, nullable: true, matches: /^(https?:\/\/)([\w\.]+)\.([a-z]{2,6}\.?)(\/[\w\.]*)*\/?$/

    }

    String toString() {
        name
    }
}

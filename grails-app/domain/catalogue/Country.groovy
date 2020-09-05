package catalogue

class Country {
    Integer id
	String name
	String capital

	static hasMany = [hotels: Hotel]

    static constraints = {
    	name blank: false, unique: true, nullable: false, maxSize: 255
    	capital blank: false, unique: true, nullable: false, maxSize: 128
    }

    String toString() {
    	name
    }
}

package catalogue

class BootStrap {

    def init = { servletContext ->
    	def russia = new Country(name: 'Russia', capital: 'Moscow').save()
        def usa = new Country(name: 'USA', capital: 'Washington').save()
        def spain = new Country(name: 'Spain', capital: 'Madrid').save()

        

        new Hotel(name: 'Marins Park Hotel',  country: russia, stars: 5, homePage: 'https://marinsparkhotels.ru').save()
        new Hotel(name: 'Abcdef',  country: russia, stars: 4, homePage: 'https://a.com').save()
        new Hotel(name: 'Bcdefg',  country: russia, stars: 3, homePage: 'https://b.com').save()
        new Hotel(name: 'Cdefgh',  country: russia, stars: 2, homePage: 'https://c.com').save()
        new Hotel(name: 'Defghj',  country: russia, stars: 5, homePage: 'https://d.com').save()
        new Hotel(name: 'Efghjk',  country: russia, stars: 4, homePage: 'https://e.com').save()
        new Hotel(name: 'Fghjkl',  country: russia, stars: 5, homePage: 'https://f.com').save()

        new Hotel(name: 'Cambria Hotel',  country: usa, stars: 4, homePage: 'https://cambria.com').save()
        new Hotel(name: 'Cambria Hotel',  country: usa, stars: 4, homePage: 'https://cambria.com').save()
        
    }

    def destroy = {
    }
}

class Movies:
    def __init__(self, pTitle, pGenre, pLanguage, pDirector, pYear):
        self.title = pTitle
        self.genre = pGenre
        self.language = pLanguage
        self.director = pDirector
        self.year = pYear
        
    def __str__(self):
        return 'Movie information: %s\n%s\n%s\n%s\n%d\n\n' %(self.title, self.genre, self.language, self.director, self.year)
        
    @property
    def position(self):
        print("Getter Method")
        return self._position
    
    
    @position.setter
    def position(self, genre):
        print('You should watch:')
        if genre == 'Romance':
            print('First Date')
        elif genre == 'Action':
            print('Mutant')
        elif genre == 'Drama':
            print('The Awekening')
        elif genre == 'Thriller':
            print('Mr K')
        elif genre == 'Horror':
            print('A Walk Down Dawson Street')
        else:
            print('This is not a valid genre')
            self._genre = genre
         
        
recommendMovie = Movies('Future Movie!', 'Action', 'English', 'Jo Shmo', 2028 )
print(recommendMovie)

recommendMovie.position = 'Action'
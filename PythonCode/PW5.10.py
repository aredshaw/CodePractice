print('Chicago\nLos Angeles\nNew York\nOsaka\nTokyo\nShanghai\nMoscow\nParis\nLondon\nSeoul\n\n')

cities = {'Chicago': 'the USA', 'Los Angeles': 'the USA', 'New York' : 'the USA', 'Osaka': 'Japan', 'Tokyo': 'Japan', 'Shanghai': 'China', 'Moscow' : 'Russia', 'Paris' : 'France', 'London' : 'England', 'Seoul' : 'South Korea'}
cit1 = input('Please enter a city name from the list above.\n')
print(cit1 + ' is located in ' + cities[cit1] + '.')
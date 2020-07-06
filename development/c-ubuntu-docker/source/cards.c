#include <stdio.h>
#include <stdlib.h>

struct card {
	char suit;
	int num;
};

void shuffle(struct card cards[]) {
	int i;
	for (i = 0; i < 52; i++) {
		int j = rand() % 52;
		struct card tmp = cards[i];
		cards[i] = cards[j];
		cards[j] = tmp;
	}
}

void create(struct card cards[]) {
	int i, j;
	char suit[4] = { 'S', 'H', 'D', 'C' };
	for (i = 0; i < 4; i++) {
		for (j = 1; j <= 13; j++) {
			cards[i*13+j-1].suit = suit[i];
			cards[i*13+j-1].num = j;
		}
	}
}

void printCards(char *name, struct card cards[], int n) {
	int i;
	for (i = 0; i < n; i++) {
		printCard(name, cards[i]);
		printf("\n");
	}
}

int main(void) {
	struct card cards[52];
	int i;

	create(cards);
	shuffle(cards);

	printCards(NULL, cards, 52);

	return 0;
}
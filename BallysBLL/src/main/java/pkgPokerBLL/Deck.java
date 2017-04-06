package pkgPokerBLL;


import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

import pkgExceptions.DeckException;
import pkgPokerEnum.eRank;
import pkgPokerEnum.eSuit;
import java.util.ArrayList;

public class Deck {

	private UUID DeckID;
	private ArrayList<Card> DeckCards = new ArrayList<Card>();

	public Deck() {

		super();
		int iCardNbr = 0;
		for (eSuit suit : eSuit.values()) {
			for (eRank rank : eRank.values()) {
				if ((suit != eSuit.JOKER) && (rank != eRank.JOKER)){
					DeckCards.add(new Card(suit, rank, ++iCardNbr));
				
			}
		}
		Collections.shuffle(DeckCards);
	}
	}
	public Deck(int iNbrOfJokers)
	{
		this();
		
		for (int i = 1; i<iNbrOfJokers;i++)
		{
			DeckCards.add(new Card(eSuit.JOKER, eRank.JOKER, 53));
		}
		Collections.shuffle(DeckCards);
	}

	public Card DrawCard() throws DeckException {
		
		{
			if (DeckCards.size() == 0)
			{
				throw new DeckException(this);
			}
			return DeckCards.remove(0);
		}
}}
Hey, this is like a super basic cryptocurrency thing called SimpleCoin. It's made in Python and not meant for serious use—just for learning how blockchain works.

If you're curious, a blockchain is like a shared database for transactions. In SimpleCoin, you can be a "miner" (think of it like a server) or just a regular user.

Here's how to use it:

1. Install the necessary stuff by typing `pip install -r requirements.txt` in your console.
2. Two options:
   - Run `miner.py` to be a node and mine coins.
   - Run `wallet.py` to be a user, send transactions, but you need to run `miner.py` too.

Important: Don't use the Python IDLE; use your console because of some technical stuff.

There are two main parts:

1. **miner.py**: This is like the big deal. It makes you a node, and you can mine coins by processing transactions. More nodes mean a safer blockchain.

2. **wallet.py**: If you just want to be a user, run this. You can create an address, send coins, and check your transactions. Just remember, if you're using a local server, you need a "miner" to process your transactions.

Feel free to contribute if you're into it. Check out CONTRIBUTING.md to learn how. Oh, and it's intentionally basic, so don't complicate things. Also, don't use this for real stuff—it's not secure and has bugs. Cool, huh?

class ChessBoard {
    private val board: Array<Array<ChessPiece?>> = Array(8) { Array(8) { null } }

    // Initialiser brettet og plasser brikkene i startposisjonen
    init {
        initializeBoard()
    }

    private fun initializeBoard() {
        // Plasser hvite brikker på rad 1 og rad 2
        for (col in 0 until 8) {
            board[1][col] = Pawn("white", 1, col)
        }

        board[0][0] = Rook("white", 0, 0)
        board[0][1] = Knight("white", 0, 1)
        board[0][2] = Bishop("white", 0, 2)
        board[0][3] = Queen("white", 0, 3)
        board[0][4] = King("white", 0, 4)
        board[0][5] = Bishop("white", 0, 5)
        board[0][6] = Knight("white", 0, 6)
        board[0][7] = Rook("white", 0, 7)

        // Plasser svarte brikker på rad 7 og rad 8
        for (col in 0 until 8) {
            board[6][col] = Pawn("black", 6, col)
        }

        board[7][0] = Rook("black", 7, 0)
        board[7][1] = Knight("black", 7, 1)
        board[7][2] = Bishop("black", 7, 2)
        board[7][3] = Queen("black", 7, 3)
        board[7][4] = King("black", 7, 4)
        board[7][5] = Bishop("black", 7, 5)
        board[7][6] = Knight("black", 7, 6)
        board[7][7] = Rook("black", 7, 7)
    }

    // Legg til flere metoder for å utføre trekk, sjekke sjakk, sjakkmatt, etc.
}

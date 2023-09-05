fun main() {
    val chessBoard = ChessBoard()

    // Utfør noen trekk (eksempler)
    chessBoard.movePiece(1, 0, 3, 0) // Hvit bonde flytter fremover
    chessBoard.movePiece(6, 1, 4, 1) // Svart bonde flytter fremover
    chessBoard.movePiece(0, 5, 4, 1) // Hvit dronning slår svart bonde

    // Vis sjakkbrettet etter trekkene
    chessBoard.displayBoard()
}
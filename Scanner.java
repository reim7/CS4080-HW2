case '/':
  if (match('/')) {
    while (peek() != '\n' && !isAtEnd()) advance();
  } else if (match('*')) {
    blockComment();
  } else {
    addToken(SLASH);
  }
  break;
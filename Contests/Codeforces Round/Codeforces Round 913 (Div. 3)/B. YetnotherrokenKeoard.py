for _ in range(int(input())):

    typed_word = list(input())
    length = len(typed_word)

    final_text = []

    upper_key_stack = []
    lower_key_stack = []

    for keys in range(length):

        if typed_word[keys] == 'b':

            if len(lower_key_stack):

                final_text[lower_key_stack.pop(-1)] = -1

        elif typed_word[keys] == 'B':

            if len(upper_key_stack):

                final_text[upper_key_stack.pop(-1)] = -1

        else:

            if ord(typed_word[keys]) >= 97:

                lower_key_stack.append(len(final_text))
                final_text.append(typed_word[keys])
            else:

                upper_key_stack.append(len(final_text))
                final_text.append(typed_word[keys])

    for j in final_text:

        if j != -1:
            print(j, end="")

    print()

/**
 * @return {number}
 */
var argumentsLength = function(...args) {
 var array = [...args];
    return array.length;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */
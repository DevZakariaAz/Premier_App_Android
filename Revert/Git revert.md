2024-10-09 21:03

Tags:[[Programming]] [[Mobile_Development]] [[Important!]]

Status:[[Done]]

# 1.What is Git revert?

### Git `revert`: Basics and Usage

#### 1. **What is `git revert`?**
- `git revert` is a command used in Git to **undo changes** made by a previous commit.
- Unlike `git reset`, `revert` doesn’t change the history or delete commits. Instead, it creates a **new commit** that undoes the changes from the specified commit.

#### 2. **Basic Syntax**:

- **View Commit History**:
  ```bash
  git log --oneline
  ```
  This command shows the commit history in a simplified form, listing commit IDs and messages in one line each.

- **Revert a Commit**:
  ```bash
  git revert <commit-hash>
  ```
  - `commit-hash`: The unique ID of the commit 


- **Resolve Conflicts (if any)**:
  - If conflicts occur during the revert, open the conflicted file, remove the conflict markers, and fix the file manually.


- **Mark Conflict as Resolved**:
  ```bash
  git add <filename>
  ```
  - After resolving conflicts.


- **Continue the Revert Process**:
  ```bash
  git revert --continue
  ```
  - After marking the conflict as resolved, continue with the revert process.


- **Push Changes to the Remote Repository**:
  ```bash
  git push origin main
  ```
  - Push your local changes (including the new revert commit) to the remote repository.

#### 3. **When to Use `git revert`**:
- When you want to **undo a commit** without affecting the commit history.
- In **collaborative projects**, to avoid disrupting other team members' work.


# References

[Official Git Documentation](https://git-scm.com/docs/git-revert)
[Atlassian Git Tutorial](https://www.atlassian.com/git/tutorials/undoing-changes/git-revert)
